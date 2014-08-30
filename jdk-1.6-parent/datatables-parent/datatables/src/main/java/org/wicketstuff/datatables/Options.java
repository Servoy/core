package org.wicketstuff.datatables;

import de.agilecoders.wicket.jquery.AbstractConfig;
import de.agilecoders.wicket.jquery.IKey;
import de.agilecoders.wicket.jquery.Key;

/**
 *
 */
public class Options extends AbstractConfig {

    /**
     * https://datatables.net/examples/basic_init/alt_pagination.html
     */
    public enum PagingType {
        /**
         *  'Previous' and 'Next' buttons only
         */
        simple,

        /**
         * 'Previous' and 'Next' buttons, plus page numbers
         */
        simple_numbers,

        /**
         * 'First', 'Previous', 'Next' and 'Last' buttons
         */
        full,

        /**
         * 'First', 'Previous', 'Next' and 'Last' buttons, plus page numbers
         */
        full_numbers
    }

    /**
     * https://datatables.net/examples/basic_init/table_sorting.html
     */
    private static final IKey<Sort[]> Order = new Key<Sort[]>("order", null);

    /**
     * https://datatables.net/examples/basic_init/state_save.html
     */
    private static final IKey<Boolean> StateSave = new Key<Boolean>("stateSave", false);

    /**
     * In seconds.
     *
     * https://datatables.net/examples/basic_init/state_save.html
     * https://datatables.net/reference/option/stateDuration
     */
    private static final IKey<Integer> StateDuration = new Key<Integer>("stateDuration", 7200);

    /**
     * https://datatables.net/examples/basic_init/alt_pagination.html
     */
    private static final IKey<PagingType> _PagingType = new Key<PagingType>("pagingType", PagingType.simple_numbers);

    public Options pagingType(PagingType pagingType) {
        put(_PagingType, pagingType);
        return this;
    }

    public Options stateSave(Boolean stateSave) {
        put(StateSave, stateSave);
        return this;
    }

    public Options stateDuration(Integer duration) {
        put(StateDuration, duration);
        return this;
    }

    public Options order(Sort... sortParams) {
        put(Order, sortParams);
        return this;
    }
}