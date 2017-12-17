package app.ui.models;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import app.objects.Racer;

public class RaceTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 7171318687705618715L;
	
	private final ArrayList<Racer> racers;
	private final String[] columnNames = new String[] { "Racer ID", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "212", "230",
			"270", "280", "290", "FINISH",};
	public RaceTableModel() {
		racers = new ArrayList<Racer>();
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return racers.size();
	}

	@Override
	public Object getValueAt(int index,int column) {
		Racer r = racers.get(index);
		if(column == 0) {
			return r.getRacerId();
		} else {
			if (r.getDistance() >= (10 * column)) {
				return "X";
			} else {
				return "";
			}
		}
		
	}

}
