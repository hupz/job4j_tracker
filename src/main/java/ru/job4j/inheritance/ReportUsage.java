package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport report1 = new HtmlReport();
        String text1 = report1.generate("Report's name", "Report's body");
        System.out.println(text1);
        JSONReport reportSecond = new JSONReport();
        String textSecond = reportSecond.generate("Report's name", "Report's body");
        System.out.println(textSecond);
    }
}