pipeline{
    agent any

    environment{
        DIRECTORY_PATH = '/Users/kemas/Desktop/Deakin University/Trimester 2 2024/SIT753/6.1C'
        TESTING_ENVIRONMENT = 'testing'
        PRODUCTION_ENVIRONMENT = 'productionEnvironment'
    }
    // test sfsdfsdfsdfsdfsdfsdf
    stages{
        stage('Build'){
            steps{
                echo "Initializing build process with Maven.."              
            }
        }
        stage('Unit and Integration Tests'){
            steps{
                echo "Executing Unit tests.."
                echo "Conducting Integration tests.."
            }
            post{
                success{
                    mail to: "kemasanka981@gmail.com",
                    subject: "Unit and Integration Tests Status email",
                    body : "Unit and Integration Tests was successfull" 
                }   
            }
        }
        stage('Code Analysis'){
            steps{
                echo "Performing code analysing.."
            }
        }
        stage('Security Scan'){
            steps{
                echo "Conducting security evalution.."
            }
        }
        stage('Deply to Staging'){
            steps{
               echo "Deploying application to staging environment.."
            }
        }
        stage('Integration Tests on Staging'){
            steps{
                echo "Running integration tests on the staging environment to ensure the application.."
            }
        }
         stage('Deploy to Production'){
            steps{
                echo "Deploying the application to a production server.."
            }
        }
    }
}
