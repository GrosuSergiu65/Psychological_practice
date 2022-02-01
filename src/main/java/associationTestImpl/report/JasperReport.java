package associationTestImpl.report;

import associationTestImpl.AccumulateAssociations;
import net.sf.dynamicreports.report.constant.HorizontalImageAlignment;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.type;
import static net.sf.dynamicreports.report.builder.DynamicReports.col;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

public class JasperReport extends StyleTemplate implements associationTest.JasperReport {

    public JasperReport() {
        build();
    }


    @Override
    public void fillTheReportWithData() {

    }

    @Override
    public void viewReport() {

    }

    private void build() {

        try {

            JRMapCollectionDataSource dataSource = new JRMapCollectionDataSource(AccumulateAssociations.getAnswers());


            report()
                    .title(cmp.text("16 associations of J. Jung").setStyle(titleStyle).setHeight(38))

                    .pageHeader(cmp.image(psychology).setStyle(pageFooterStyle).setDimension(210, 50)
                            .setHorizontalImageAlignment(HorizontalImageAlignment.RIGHT).setHeight(53))

                    .columns(
                            col.column("First Column", "First Column", type.stringType()).setStyle(columnStyle)
                                    .setTitleStyle(columnTitleStyle).setTitleFixedHeight(25).setFixedHeight(41).setWidth(16),
                            col.column("Second Column", "Second Column", type.stringType()).setStyle(columnStyle)
                                    .setTitleStyle(columnTitleStyle).setTitleFixedHeight(25).setFixedHeight(41).setWidth(8),
                            col.column("Third Column", "Third Column", type.stringType()).setStyle(columnStyle)
                                    .setTitleStyle(columnTitleStyle).setTitleFixedHeight(25).setFixedHeight(41).setWidth(4),
                            col.column("Fourth Column", "Fourth Column", type.stringType()).setStyle(columnStyle)
                                    .setTitleStyle(columnTitleStyle).setTitleFixedHeight(25).setFixedHeight(41).setWidth(2),
                            col.column("Key", "Key", type.stringType()).setStyle(columnStyle)
                                    .setTitleStyle(columnTitleStyle).setTitleFixedHeight(25).setFixedHeight(41).setWidth(1)

                         ).setDataSource(dataSource)
                    .summary(cmp.text("* THIS IS THE END *")
                            .setDimension(151,19).setStyle(stl.style().setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT).bold()))


                    .show();


        } catch (DRException e) {
            e.printStackTrace();
        }
    }


}
