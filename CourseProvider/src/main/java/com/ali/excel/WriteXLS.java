package com.ali.excel;


import com.ali.entity.CourseInfo;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class WriteXLS {
    public void exportExcel(List<CourseInfo> list) {
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook ();
        HSSFSheet sheet = hssfWorkbook.createSheet ();
        HSSFRow titleRow = sheet.createRow (0);
        titleRow.createCell (0).setCellValue ("课程编号");
        titleRow.createCell (1).setCellValue ("课程名称");
        titleRow.createCell (2).setCellValue ("学分");
        titleRow.createCell (3).setCellValue ("课程类型");
        titleRow.createCell (4).setCellValue ("类型描述");
        titleRow.createCell (5).setCellValue ("课程学科");
        titleRow.createCell (6).setCellValue ("学科描述");
        titleRow.createCell (7).setCellValue ("上课时间");
        titleRow.createCell (8).setCellValue ("课程学时");
        titleRow.createCell (9).setCellValue ("开始时间");
        titleRow.createCell (10).setCellValue ("结课时间");
        titleRow.createCell (11).setCellValue ("上课教室");
        for (CourseInfo CourseInfo : list) {
            //获取当前最大的行

            int lastRowNum = sheet.getLastRowNum ();
            //新创建一行操作
            HSSFRow dataRow = sheet.createRow (lastRowNum + 1);
            dataRow.createCell (0).setCellValue (CourseInfo.getCouid());
            dataRow.createCell (1).setCellValue (CourseInfo.getCouname()==null?"":CourseInfo.getCouname());
            dataRow.createCell (2).setCellValue (CourseInfo.getBak1()==null?"":CourseInfo.getBak1());
            dataRow.createCell (3).setCellValue (CourseInfo.getCtname()==null?"":CourseInfo.getCtname());
            dataRow.createCell (4).setCellValue (CourseInfo.getCtdesc()==null?"":CourseInfo.getCtdesc());
            dataRow.createCell (5).setCellValue (CourseInfo.getCpname()==null?"":CourseInfo.getCpname());
            dataRow.createCell (6).setCellValue (CourseInfo.getCpdesc()==null?"":CourseInfo.getCpdesc());
            dataRow.createCell (7).setCellValue (CourseInfo.getCoursedate()==null?"":CourseInfo.getCoursedate());
            dataRow.createCell (8).setCellValue (CourseInfo.getHour()==null?0:CourseInfo.getHour());
            dataRow.createCell (9).setCellValue (CourseInfo.getStarts()==null?"":CourseInfo.getStarts());
            dataRow.createCell (10).setCellValue (CourseInfo.getOvers()==null?"":CourseInfo.getOvers());
            dataRow.createCell (11).setCellValue (CourseInfo.getCraddr()==null?"":CourseInfo.getCraddr());
        }
        String fileName = "课程.xls";
        try {
            FileOutputStream fileOut = new FileOutputStream (fileName);
            hssfWorkbook.write (fileOut);
            hssfWorkbook.close ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
