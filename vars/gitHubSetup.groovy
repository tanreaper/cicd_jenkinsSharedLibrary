def call(Map gitHubOption) {
    gitHubOption.each {
        key, value ->
            println "${key} : ${value}"
    }
}

def checkParams(Map repoDetails) {
    echo "Checking parameters..."
    echo "Name: ${repoDetails.name}"
    echo "Description: ${repoDetails.description}"
    echo "Private: ${repoDetails.private}"
    echo "Owner: ${repoDetails.owner}"
}