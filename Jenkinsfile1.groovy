pipeline {

    agent any  

    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				
				echo "start build testcase!"
				echo "finish build testcase!"
				}
		post {
			always { 
				script{
					step(
							[
                              $class              : 'RobotPublisher',
                              outputPath          : '.',
                              outputFileName      : 'output.xml',
                              reportFileName      : 'report.html',
                              logFileName         : 'log.html',
                              disableArchiveOutput: false,
                              passThreshold       : 100,
                              unstableThreshold   : 80,
                            ]
						)
					echo "The report have update!"
					}
				}
			}
		}
	}	
}