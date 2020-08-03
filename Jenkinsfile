pipeline {
	 
	 agent {
		label 'GUISlave'
	}
	stages{
	
	stage('Run the mvn install'){
	    steps{
	     script {
	         
	         dir('Code/AnaVodafone'){
	             
	             sh '''
	            export no_proxy="http://localhost"
	            export no_proxy="http://127.0.0.1"
	            export no_proxy="http://127.0.0.1:4723/wd/hub"
                export ANDROID_HOME=/data/sdk
	            echo $no_proxy
                echo $ANDROID_HOME
                env
                mvn clean install
	             '''
	             
	         }
	         
	     }
	    
	    
	}
	}
	}
	
	}
