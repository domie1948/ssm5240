const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm6p3nm/",
            name: "ssm6p3nm",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6p3nm/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "图书馆管理系统"
        } 
    }
}
export default base
