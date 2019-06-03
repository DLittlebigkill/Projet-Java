package controller;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;

import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * @author Groupe10
 * The Class Controller.
 */
public final class Controller implements IController {

	private IModel model;
	private IView view;


	private void setView(final IView pview) {
		this.view = pview;
	}

	private void setModel(final IModel model) {
		this.model = model;
				}

		
	}
