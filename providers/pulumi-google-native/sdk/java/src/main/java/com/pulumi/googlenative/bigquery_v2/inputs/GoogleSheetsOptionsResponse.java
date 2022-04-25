// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GoogleSheetsOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleSheetsOptionsResponse Empty = new GoogleSheetsOptionsResponse();

    /**
     * [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
     * 
     */
    @Import(name="range", required=true)
    private String range;

    /**
     * @return [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
     * 
     */
    public String range() {
        return this.range;
    }

    /**
     * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N &gt; 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
     */
    @Import(name="skipLeadingRows", required=true)
    private String skipLeadingRows;

    /**
     * @return [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N &gt; 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
     */
    public String skipLeadingRows() {
        return this.skipLeadingRows;
    }

    private GoogleSheetsOptionsResponse() {}

    private GoogleSheetsOptionsResponse(GoogleSheetsOptionsResponse $) {
        this.range = $.range;
        this.skipLeadingRows = $.skipLeadingRows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleSheetsOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleSheetsOptionsResponse $;

        public Builder() {
            $ = new GoogleSheetsOptionsResponse();
        }

        public Builder(GoogleSheetsOptionsResponse defaults) {
            $ = new GoogleSheetsOptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param range [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
         * 
         * @return builder
         * 
         */
        public Builder range(String range) {
            $.range = range;
            return this;
        }

        /**
         * @param skipLeadingRows [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N &gt; 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
         * 
         * @return builder
         * 
         */
        public Builder skipLeadingRows(String skipLeadingRows) {
            $.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public GoogleSheetsOptionsResponse build() {
            $.range = Objects.requireNonNull($.range, "expected parameter 'range' to be non-null");
            $.skipLeadingRows = Objects.requireNonNull($.skipLeadingRows, "expected parameter 'skipLeadingRows' to be non-null");
            return $;
        }
    }

}
