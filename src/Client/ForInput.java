package Client;

import java.io.*;

public class ForInput {

    public static void main(String[] args){
        new ForInput().toFile();
    }
    public void toBytes(String file){
        String fileName="src\\Client\\Resource\\";
        fileName+=file;
        byte[] buffer = null;
        try {
            File f = new File(fileName);
            FileInputStream fis = new FileInputStream(f);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0;i<buffer.length;i++) {System.out.print(buffer[i]);}
    }
    public void toFile(){
        String result="";
        result="POST src/Server/Resource/New/ HTTP/1.1"+System.getProperty("line.separator")+"Content-type:text/plain"+System.getProperty("line.separator")+"Content-length:746"+System.getProperty("line.separator")+"If-modified-since:2019-05-20 09:19:29"+System.getProperty("line.separator")+"Connection:keep-alive"+System.getProperty("line.separator")+System.getProperty("line.separator")+"-1-40-1-3201674707370011109609600-1-3706702718202320172723222330282732406643403737408158614866968510110095859391106120-103-127106113-1121159193-123-75-122-112-98-93-85-83-85103-128-68-55-70-90-57-103-88-85-92-1-37067128303040354078434378-9211093110-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-92-1-6401780460473134021713171-1-6002500311100000000000345206-1-6004516022133246300000012317041833496597348151950-796113-111-95-47-3166-127-16-1-600241111110000000000032140-1-600261702311000000000000121718333-1-380123102173170630-1211861-161910634-1275561-33965739-310253-1095838-603272-26-105-361512420112-92124-42-25-18-57-83-31-5412141434952-78106-29842612117735-117-48-79-793-30-5128-10211814-9293-1714105121-23-7628-93126115-12761-11379565911811066105-2573-298935109-5412487-19-121-55-116100-457436641287-2294-29-56-540-1261317-567-8260101100-756666538-867391-23-114-1129599-33-18637630-94100-9822-1184123127-125-25-9010125-22-70-88159-61-10681-181563-5073-12049-11111894-21-63-110-73108-24-25-5153-2143-64-703712102114-83-69-12444-54841231124-3288-6010133-38104-12-10544998122117-179911-83-117817344102-62146998-65628240108-36120-9613-2-103-703543-47-8372-48-4-86-127-11719-2667032126-11-116-24387173977046-88657-6731-2028-1055219-90-120110-781119-74-66-111-19-11412631-116-78-533782-1023-5195-13-11923108-13-12411511853-15885-93105-12520-11033-2397-10-131204526-776830104-62-567960861984-307710011217-230-71-1370-77-94114-38-119111-94-86-11260-10-5711-933813-122-52-10731802-1044-421185-1196618-50-1739-56107-12048-94-43-496087-9-108-76-48-5712653430-111-28-3437-8385-72-2834-39172-97-113-6556-41-61-40-74-10384-1368-816251-89-1011086127-1-39";
        String path="src\\Client\\Resource\\Message1";
        File f=new File(path);
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter writer = new FileWriter(f, false);
            writer.append(result);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
