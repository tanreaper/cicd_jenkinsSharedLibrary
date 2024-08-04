def call(Map gitHubOption) {
    echo "creating Repo"
    gitHubOption.each {
        key, value ->
            println "${key} : ${value}"
    }
    // echo "${gitHubOption.GITHUB_REPO_NAME}"

    sh """
        curl -H "Authorization: token ${TOKEN}" \
        -H "Content-Type: application/json" \
        -d '{
       "name": "${gitHubOption.name}",
       "description": "${gitHubOption.description}",
       "private": "${gitHubOption.private}",
       "owner": "${gitHubOption.owner}"
        }' \
        "${GITHUB_BASE_URL}/user/repos"
    """
}

def checkParams(Map gitHubOption) {
    gitHubOption.each {
        key, value ->
            echo "${key} : ${value}"
    }
}