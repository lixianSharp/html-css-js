// JavaScript Document
/*
	���󣺱�дһ��js�ļ�����js�ļ����Զ���һ�����鹤�߶��󣬸ù��߶���Ҫ��һ���ҵ����ֵ�ķ���������Ԫ�ض�Ӧ������ֵ�ķ�����
*/


	function ArrayTool(){
			//�����ֵ
			this.getMax = function(arr){
					var max = arr[0];
					for(var i=0;i<arr.length;i++){
							if(arr[i]>max){
									max = arr[i];
							}
					}
					return max;
			}
			//��Ԫ�ض�Ӧ������ֵ
			this.getIndex = function(arr,target){
					for(var i = 0;arr.length;i++){
							if(arr[i]==target){
									return i;
							}
					}
					return -1;
			}
	}


	//��������
	var tool = new ArrayTool();