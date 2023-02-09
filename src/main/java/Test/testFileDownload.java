package Test;

import Utils.FileDownload;

import java.io.File;
/**
 * @description:
 * @author: XiaoGao
 * @time: 2023/2/9 22:17
 */
public class testFileDownload {

    public static void main(String[] args) {
        String photoUrl = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
        String fileName = photoUrl.substring(photoUrl.lastIndexOf("/"));
        //System.out.println("fileName---->"+fileName);
        String filePath = "F:\\360MoveData\\Users\\xiaog\\Desktop";
        File file = FileDownload.saveUrlAs(photoUrl, filePath + fileName,"GET");
        System.out.println("Run ok!/n<BR>Get URL file " + file);
    }

}
