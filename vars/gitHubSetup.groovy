def call(Map gitHubOption) {
    echo "creating Repo"
    gitHubOption.each {
        key, value ->
            println "${key} : ${value}"
    }
    echo "${gitHubOption.GITHUB_REPO_NAME}"

    // sh """
    //     curl -H "Authorization: token ${TOKEN}" \
    //     -H "Content-Type: application/json" \
    //     -d '{
    //    "name": "${gitHubOption.GITHUB_REPO_NAME}",
    //    "description": "${gitHubOption.REPO_DESCRIPTION}",
    //    "private": "${gitHubOption.GITHUB_REPO_TYPE}",
    //    "owner": "${gitHubOption.OWNER}"
    //     }' \
    //     {GITHUB_BASE_URL}/user/repos
    // """
}

def checkParams(Map gitHubOption) {
    gitHubOption.each {
        key, value ->
            echo "${key} : ${value}"
    }
}