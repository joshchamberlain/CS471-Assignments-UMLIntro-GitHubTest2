package edu.boisestate.cs471;

import java.awt.EventQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import edu.boisestate.cs471.controller.Controller;
import edu.boisestate.cs471.model.Model;
import edu.boisestate.cs471.view.View;

public final class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    private Main() {
        // Do not allow instantiation.
    }

    /**
     * Main program entry point.
     *
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {

        final Model model = new Model();
        final Controller controller = new Controller(model);

        EventQueue.invokeLater(() -> {
            try {
                final View view = new View(controller);
                view.show();
            }
            catch (final Exception e) {
                logger.catching(e);
            }
        });
    }

}
