pipeline {

    agent any  

    stages {  
        stage("build") {
            steps {
				script{
					sh"""
					${build_commnd}
					"""	  	    		  				
					echo " ${build_commnd}"
					}
				}
			}
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
