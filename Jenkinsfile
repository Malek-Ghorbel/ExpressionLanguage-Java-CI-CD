pipeline {
    agent any

    environment {
        GIT_REPO_URL = 'https://github.com/Malek-Ghorbel/ExpressionLanguage-Java.git'
        GIT_CREDENTIALS_ID = 'githubcred'
        imagename = "malekghorbel/parser"
        registryCredential = 'dockerhub'
        dockerImage = ''
        ARM_CLIENT_ID       = '465751c7-8537-4ab8-a8df-65130d303b24'
        ARM_CLIENT_SECRET   = credentials('azure-secret')
        ARM_TENANT_ID       = 'dbd6664d-4eb9-46eb-99d8-5c43ba153c61'
        ARM_SUBSCRIPTION_ID = '45d598b0-9aae-47da-b875-dad6e37e538d'
    }

    stages {
        stage('Fetch from Git') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']],
                    userRemoteConfigs: [[credentialsId: GIT_CREDENTIALS_ID, url: GIT_REPO_URL]]])
            }
        }
        stage('Build with Maven') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build imagename
                }
            }
        }

        stage('Push Image') {
          steps{
            script {
              docker.withRegistry( '', registryCredential ) {
                dockerImage.push("$BUILD_NUMBER")
                 dockerImage.push('latest')
              }
            }
          }
        }

        

        // stage('Deploy to Kubernetes') {
        //     steps {
        //         script {
        //             // Deploy to Kubernetes
        //             sh 'kubectl apply -f k8s/'
        //             sh 'kubectl rollout status deployment/myapp'
        //         }
        //     }
        // }

        stage('Déploiement de l\'Infrastructure Terraform') {
            steps {
                // Initialiser Terraform
                sh 'terraform init'
                // Appliquer la configuration Terraform
                sh 'terraform plan'
                sh 'terraform apply -auto-approve'
            }
        }

        stage('Deploy to Azure') {
            steps {
                script {
                    // Se connecter à Azure
                    sh 'az login --service-principal -u $ARM_CLIENT_ID -p $ARM_CLIENT_SECRET --tenant $ARM_TENANT_ID'
                    // Définir le contexte Azure sur l'abonnement approprié
                    sh 'az account set --subscription $ARM_SUBSCRIPTION_ID'
                    // Déployer l'image Docker sur Azure App Service
                    sh 'az webapp config container set --name AppService4167 --resource-group myResourceGroup --docker-custom-image-name malekghorbel/parser:latest'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline successfully completed!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}