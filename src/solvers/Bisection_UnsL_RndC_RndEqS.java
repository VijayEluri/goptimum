package solvers;

import splitters.RndSideEquallySplitter;
import splitters.Splitter;
import worklists.UnSortedWorkList;
import worklists.WorkList;
import choosers.Chooser;
import choosers.RandomChooser;
import core.Box;
import functions.Function;
import algorithms.BaseAlgorithm;

/*
 * Naming convention for strategies:
 * Name contains: 
 *  Idea of the method (Bisection)
 *  Type of WorkList + "L" (UnsL stands for UnSorted WorkList)
 *  Type of Chooser + "C" (RndC stands for Random Chooser)
 *  Type of Splitter + "S" (RndEqS stands for RndSideEquallySplitter)
 * 
 */
public class Bisection_UnsL_RndC_RndEqS extends BaseAlgorithm implements IntervalSolver {

	public Bisection_UnsL_RndC_RndEqS() {
		WorkList workList = new UnSortedWorkList();
		Chooser chooser  = new RandomChooser(workList);
		Splitter splitter = new RndSideEquallySplitter();
		setLogic(workList, chooser, splitter);		
	}
}