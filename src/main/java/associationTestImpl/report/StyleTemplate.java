
package associationTestImpl.report;

import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.constant.ImageScale;
import net.sf.dynamicreports.report.constant.VerticalImageAlignment;

import java.awt.Color;

import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

public class StyleTemplate {
    protected StyleBuilder titleStyle = stl.style()
            .setName("style1")
            .bold()
            .setTabStopWidth(180)
            .setHorizontalTextAlignment(HorizontalTextAlignment.LEFT)
            .setFontSize(16)
            .setForegroundColor(Color.black);


    protected StyleBuilder pageFooterStyle = stl.style()
            .setFontSize(10)
            .setBold(false)
            .setImageScale(ImageScale.RETAIN_SHAPE)

            .setVerticalImageAlignment(VerticalImageAlignment.TOP)
            .setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT);

    protected StyleBuilder columnStyle = stl.style()
            .setBorder(stl.pen1Point())
            .setFontSize(10);

    protected StyleBuilder columnTitleStyle = stl.style()
            .setBorder(stl.pen1Point())
            .setBackgroundColor(new Color(207, 217, 230))
            .setFontSize(10)
            .bold();

    protected StyleBuilder border = stl.style()
            .setBorder(stl.pen1Point());

    protected final String pageFooter = "The page footer band appears on every page where there is a page header." +
            "Like the column footer, it is not resizable at run time.";
    protected final String columnFooter = "The column header band is printed at the beginning of each detail column." +
            "Usually labels containing the column names of a tabular report are inserted in this band.";


    protected final String psychology =
            "https://tuitionbag.com/store/1/default_images/blogs/psychology-fb.jpg";
}