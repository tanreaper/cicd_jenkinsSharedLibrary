def call(Map gitHubOption) {
    echo "creating Repo"
    gitHubOption.each {
        key, value ->
            println "${key} : ${value}"
    }
    sh """
        curl -H "Authorization: token ${TOKEN}" \
        -H "Content-Type: application/json" \
        -d '{
       "name": "${githubOption.GITHUB_REPO_NAME}",
       "description": "${githubOption.REPO_DESCRIPTION}",
       "private": "${githubOption.GITHUB_REPO_TYPE}",
       "owner": "${githubOption.OWNER}"
        }' \
        {GITHUB_BASE_URL}/user/repos
    """
}

def checkParams(Map gitHubOption) {
    gitHubOption.each {
        key, value ->
            echo "${key} : ${value}"
    }
}