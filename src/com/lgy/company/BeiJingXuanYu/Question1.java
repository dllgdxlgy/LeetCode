package com.lgy.company.BeiJingXuanYu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>背景: C/C++程序构建过程需要经过预处理、编译、汇编和链接，最终生成目标码。其中预处理文件用于展开头文件和宏替换，
 * 预处理文件中使用预处理标记表示该行代码与原始代码的对应关系，以#开头，后面为原始文件的行号和原始文件路径等信息。如下所示：
 * # 221 "e:\\mingw\\lib\\gcc\\mingw32\\6.3.0\\include\\c++\\mingw32\\bits\\c++config.h" 3
 * <p>功能：实现一个函数，输入Question1_input.i文件,过滤掉以#开头的预处理行(用空行替代)，把结果输出到Question1_output.i文件中

 */
public class Question1 {

	public List<String> readFile02(String path) throws IOException {

		List<String> list = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(path);

		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		while ((line = br.readLine()) != null) {

			if (line.lastIndexOf("---") < 0) {
				list.add(line);
			}
		}
		br.close();
		isr.close();
		fis.close();
		return list;
	}

	public void answer() throws IOException {
	    //TODO
		String path = "src/com/lgy/company/BeiJingXuanYu/Question1_input.i";
		List<String> list = readFile02(path);
		FileWriter fw = new FileWriter("src/com/lgy/company/BeiJingXuanYu/Question1_output.i",true);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("")){
				fw.write("\r\n");
				continue;
			}
			if( list.get(i).charAt(0) =='#'){
				fw.write("\r\n");
				continue;
			}else {
				fw.write(list.get(i));
				fw.write("\r\n");
			}
		}

	}
	public static void main(String[] args) throws IOException {
        new Question1().answer();
    }
}
 