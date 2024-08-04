@Library('jenkinsSharedLibraryExt')_

pipeline {
    agent any
    parameters {
        choice          (name: 'GITHUB_REPO', choices:['add', 'delete'], description: 'Add or delete a repository')
        string          (name: 'GITHUB_REPO_NAME', defaultValue: '', description: 'Enter the name of the repository')
        string          (name: 'REPO_DESCRIPTION', defaultValue: '', description: 'Please add description')
        choice          (name: 'GITHUB_REPO_TYPE', choices:['public', 'private'], description: 'Enter the type of the repository')
        secret          (name: 'GITHUB_TOKEN', defaultValue:'', description: 'Enter the token')
        string          (name: 'OWNER', defaultValue: 'tanreaper', description: 'Enter the owner of the repository')
    }   

    stages {
        stage('checkParams') {
            steps {
                script {
                    def repoDetails = [
                        name: ${GITHUB_REPO_NAME},
                        description: ${REPO_DESCRIPTION},
                        private: ${GITHUB_REPO_TYPE},
                        owner: ${OWNER},
                    ]
                    gitHubSetup.checkParams(repoDetails)
                }
            }
        }
    }
}