package learnway.view.instructor.dashboard;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.util.UIScale;
import learnway.components.Background;
import learnway.view.admin.dashboard.forms.AdminDashboardForm;
import raven.popup.GlassPanePopup;

import javax.swing.*;
import java.awt.*;
import learnway.view.instructor.dashboard.forms.InstructorDashboardForm;
import learnway.view.instructor.dashboard.menu.InstructorFormManager;

/**
 *
 * @author Raven
 */
public class InstructorDashboard extends JFrame {

    private final boolean UNDECORATED = !true;

    public InstructorDashboard() {
        init();
    }

    private void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(UIScale.scale(new Dimension(1366, 768)));
        setLocationRelativeTo(null);
        if (UNDECORATED) {
            setUndecorated(UNDECORATED);
            setBackground(new Color(0, 0, 0, 0));
        } else {
            getRootPane().putClientProperty(FlatClientProperties.FULL_WINDOW_CONTENT, true);
        }
        setContentPane(new Background(UNDECORATED));
        // applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        GlassPanePopup.install(this);
        InstructorFormManager.install(this, UNDECORATED);
        InstructorFormManager.showForm(new InstructorDashboardForm());
        // applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("learnway.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(() -> new InstructorDashboard().setVisible(true));
    }
}
