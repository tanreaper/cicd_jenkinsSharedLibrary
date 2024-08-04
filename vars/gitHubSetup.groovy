// def call(Map gitHubOption) {
//     gitHubOption.each {
//         key, value ->
//             println "${key} : ${value}"
//     }
// }

def checkParams(map gitHubOption) {
    gitHubOption.each {
        key, value ->
            echo "${key} : ${value}"
    }
}