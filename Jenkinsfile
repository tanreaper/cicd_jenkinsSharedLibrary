@Library('jenkinsSharedLibraryExt')_

pipeline {
    agent any
    environment {
        def TOKEN = credentials('GITHUB-TOKEN')
    }
    parameters {
        choice          (name: 'GITHUB_REPO', choices:['add', 'delete'], description: 'Add or delete a repository')
        string          (name: 'GITHUB_REPO_NAME', defaultValue: '', description: 'Enter the name of the repository')
        string          (name: 'REPO_DESCRIPTION', defaultValue: '', description: 'Please add description')
        choice          (name: 'GITHUB_REPO_TYPE', choices:['public', 'private'], description: 'Enter the type of the repository')
        string          (name: 'OWNER', defaultValue: 'tanreaper', description: 'Enter the owner of the repository')
    }   

    stages {
        stage('checkParams') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'GITHUB-TOKEN', variable: 'TOKEN')]) {
                        repoDetails = [
                            name: params.GITHUB_REPO_NAME,          // Use params to access pipeline parameters
                            description: params.REPO_DESCRIPTION,
                            private: params.GITHUB_REPO_TYPE, // Convert choice to boolean
                            owner: params.OWNER
                        ]
                        echo "Repository Details: ${repoDetails}"
                        gitHubSetup.checkParams(repoDetails)
                        gitHubSetup(repoDetails)
    
                    }

                }
            }
        }
        // stage('createRepo') {
        //     steps {
        //         script {
        //             gitHubSetup(repoDetails)
        //         }
        //     }
        // }
    }
}