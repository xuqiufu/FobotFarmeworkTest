pipeline {
    // 构建节点，any 代表任意节点
    agent any  
   // 构建阶段，可以有多个阶段
    stages {  
        // 构建阶段一
        stage("Hello") {
            // 阶段一执行的步骤一
            // 可以有多个步骤
            steps {
                // 步骤内构建脚本
                echo "Hello World!"
				scripts{
				bat '''
				${build_commnd}
				'''
            }
        }
    }
    // 构建后置操作
    post {
        // always 代表总是触发
        always {  
            echo "Say goodbye!"
        }
    }
}