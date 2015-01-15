IKDDhw11 第六組 劉弘偉 黃柏瑜

環境 ubunto 12.04 32位元 with VirtualBox
     Java JDK 8u25

檔案:
IKDDhw11.pig	(pig source code) 
UDF.java	(UDF source code)
myudf.jar
result.txt	(result which I test)

command:
pig -param input=(輸入檔案) -param output=(輸出目錄) -x local IKDDhw11.pig

輸出目錄必須不存在

