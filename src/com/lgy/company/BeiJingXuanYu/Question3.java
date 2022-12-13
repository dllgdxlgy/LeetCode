package com.lgy.company.BeiJingXuanYu;

/**
 * <p>背景: Makefile是一种流行的构建脚本，其中使用+=连接源文件列表、头文件列表和参数列表等，
 * 列表元素以空格分隔多个源文件或参数，也可以使用反斜杠(\)连接下一行，还可以一行一个文件或参数地连接，
 * 示例如下，其中SOURCES表示源文件列表，HEADERS表示头文件列表，不考虑文件名含有空格的情况
 * <pre>
SOURCES += main.cpp   MainFrame.cpp     \
    GamePanel.cpp     GameControl.cpp    MarkBoard.cpp     Player.cpp \
    Robot.cpp \
    UserPlayer.cpp 
    
SOURCES    += Cards.cpp CardPic.cpp
    SOURCES +=    Strategy.cpp
SOURCES    += CallLordThread.cpp
SOURCES+=PlayHandThread.cpp

HEADERS  += MainFrame.h \
    GamePanel.h \
    GameControl.h \
            MarkBoard.h \
    Player.h \
    Robot.h \
    UserPlayer.h   Cards.h  CardPic.h \
    Strategy.h \
    CallLordThread.h \
    PlayHandThread.h \
    Hand.h
    </pre>
 * <p>要求：解析Question3.input文件，使用+=连接符按照一行一个文件的格式分别把SOURCES和HEADERS写到
 * Question3.output文件中，格式如下所示
 * <pre>
 SOURCES += main.cpp  
 SOURCES += MainFrame.cpp
 SOURCES += GamePanel.cpp
    ...
 SOURCES += CallLordThread.cpp
 SOURCES += PlayHandThread.cpp
  </pre>
 */
public class Question3 {
    public void answer() throws Exception {
        //TODO
    }


    public static void main(String[] args) throws Exception {
        new Question3().answer();
    }
}
