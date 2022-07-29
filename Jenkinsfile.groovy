pipeline {

    agent any  

    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				
				echo "Say goodbye!"
				bat '''@echo off
				
				%build_commnd%
				//pybot keyword_driven.robot
				'''
				//${build_commnd}
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
					echo "Say goodbye!"
					}
				}
			}
		}
	}	
}