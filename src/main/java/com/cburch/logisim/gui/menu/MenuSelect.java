/* added by Andres Orellana */

package com.cburch.logisim.gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

//import com.cburch.logisim.gui.main.Frame;
//import com.cburch.logisim.gui.opts.OptionsFrame;
//import com.cburch.logisim.gui.prefs.PreferencesFrame;
import com.cburch.logisim.proj.Project;
//import com.cburch.logisim.proj.ProjectActions;
import static com.cburch.logisim.util.LocaleString.*;

@SuppressWarnings("serial")
class MenuSelect extends Menu implements ActionListener {
    private LogisimMenuBar menubar;
    
    private JMenuItem PokeTool = new JMenuItem();
    private JMenuItem ArrowSelect = new JMenuItem();
    private JMenuItem InputPin = new JMenuItem();
    private JMenuItem OutputPin = new JMenuItem();
    private JMenuItem AndGate = new JMenuItem();
    private JMenuItem OrGate = new JMenuItem();
    private JMenuItem NotGate = new JMenuItem();
    

    public MenuSelect(LogisimMenuBar menubar) {
        this.menubar = menubar;

        int menuMask = getToolkit().getMenuShortcutKeyMask();

        PokeTool.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_1, menuMask));
        ArrowSelect.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_2, menuMask));
        InputPin.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_4, menuMask));
        OutputPin.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_5, menuMask));
        AndGate.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_6, menuMask));
        OrGate.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_7, menuMask));
        NotGate.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_8, menuMask));

        add(PokeTool);
        add(ArrowSelect);
        add(InputPin);
        add(OutputPin);
        addSeparator();
        add(AndGate);
        add(OrGate);
        add(NotGate);

        Project proj = menubar.getProject();

        //when there is a project not available it disables the shortcuts
        if (proj == null) {
        	PokeTool.setEnabled(false);
        	ArrowSelect.setEnabled(false);
        	InputPin.setEnabled(false);
        	OutputPin.setEnabled(false);
        	AndGate.setEnabled(false);
        	OrGate.setEnabled(false);
        	NotGate.setEnabled(false);
        } else { //when there is a project available enable the shortcuts
        	PokeTool.addActionListener(this);
        	ArrowSelect.addActionListener(this);
        	InputPin.addActionListener(this);
        	OutputPin.addActionListener(this);
        	AndGate.addActionListener(this);
        	OrGate.addActionListener(this);
        	NotGate.addActionListener(this);
        }
        
    }

    public void localeChanged() {
        this.setText(getFromLocale("Select"));
        PokeTool.setText(getFromLocale("Poke Tool"));
        ArrowSelect.setText(getFromLocale("Arrow Select"));
        InputPin.setText(getFromLocale("Input Pin"));
        OutputPin.setText(getFromLocale("Output Pin"));
        AndGate.setText(getFromLocale("And Gate"));
        OrGate.setText(getFromLocale("Or Gate"));
        NotGate.setText(getFromLocale("Not Gate"));
    }

    @Override
    void computeEnabled() {
        setEnabled(true);
        menubar.fireEnableChanged();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        //Project proj = menubar.getProject();
        if (src == PokeTool) {
            //ProjectActions.doNew(proj);
        } else if (src == ArrowSelect) {
            //ProjectActions.doOpen(proj == null ? null : proj.getFrame().getCanvas(), proj);
        } else if (src == InputPin) {
            //ProjectActions.doSave(proj);
        } else if (src == OutputPin) {
            //ProjectActions.doSaveAs(proj);
        } else if (src == AndGate) {
            //PreferencesFrame.showPreferences();
        } else if (src == OrGate) {
            //ProjectActions.doQuit();
        } else if (src == NotGate) {
            //ProjectActions.doQuit();
        }
        
    }
}
