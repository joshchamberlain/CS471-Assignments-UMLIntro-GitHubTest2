package edu.boisestate.cs471.model;

public class BubbleSort extends SortingAlgorithm {

    private int mOuterLoopIndex;
    private int mInnerLoopIndex;
    private boolean mFoundChanges;

    /**
     * Instantiate a bubble sort instance, starting with a given sample size.
     * @param sampleSize The number of samples to use in the sorting data.
     */
    public BubbleSort(final int sampleSize) {
        super(sampleSize);
        onReset();
    }

    @Override
    public final String getName(final String language) {
        switch (language) {
            case "Spanish":
                return "Ordenación de burbuja";
            case "english":
            default:
                return "Bubble Sort";
        }
    }

    private final void bubble(int firstIndex, int secondIndex) {
        if (mData[firstIndex] > mData[secondIndex]) {
            // swap elements
            final int temp = mData[firstIndex];
            mData[firstIndex] = mData[secondIndex];
            mData[secondIndex] = temp;
            mColors[firstIndex] = COLOR_SWAPPED;
            mColors[secondIndex] = COLOR_SWAPPED;
            mFoundChanges = true;
        }
        else {
            mColors[firstIndex] = COLOR_COMARED;
            mColors[secondIndex] = COLOR_COMARED;
        }
    }

    @Override
    public final boolean doSortIteration() {
        resetColors();
        // Colorize the entries that are known to be sorted
        for (int i = mData.length - mOuterLoopIndex; i < mData.length; i++) {
            mColors[i] = COLOR_SORTED;
        }
        boolean retValue = false;

        if (mOuterLoopIndex < mData.length) {
            if (mInnerLoopIndex < mData.length) {
                bubble(mInnerLoopIndex - 1, mInnerLoopIndex);
                mInnerLoopIndex++;
            }
            else {
                if (!mFoundChanges) {
                    retValue = true;
                    // Everything is sorted, so set the color to sorted.
                    for (int i = 0; i < mOuterLoopIndex; i++) {
                        mColors[i] = COLOR_SORTED;
                    }
                    mOuterLoopIndex = mData.length + 1;
                }
                mOuterLoopIndex++;
                mInnerLoopIndex = 1;
                mFoundChanges = false;
            }
        }

        return retValue;
    }

    @Override
    protected final void onReset() {
        mOuterLoopIndex = 0;
        mInnerLoopIndex = 1;
        mFoundChanges = false;
    }
}
