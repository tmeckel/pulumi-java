// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CsvOptionsResponse {
    /**
     * [Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
     * 
     */
    private final Boolean allowJaggedRows;
    /**
     * [Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
     * 
     */
    private final Boolean allowQuotedNewlines;
    /**
     * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
     * 
     */
    private final String encoding;
    /**
     * [Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
     * 
     */
    private final String fieldDelimiter;
    /**
     * [Optional] An custom string that will represent a NULL value in CSV import data.
     * 
     */
    private final String nullMarker;
    /**
     * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
     * 
     */
    private final String quote;
    /**
     * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped. When autodetect is on, the behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
     */
    private final String skipLeadingRows;

    @OutputCustomType.Constructor
    private CsvOptionsResponse(
        @OutputCustomType.Parameter("allowJaggedRows") Boolean allowJaggedRows,
        @OutputCustomType.Parameter("allowQuotedNewlines") Boolean allowQuotedNewlines,
        @OutputCustomType.Parameter("encoding") String encoding,
        @OutputCustomType.Parameter("fieldDelimiter") String fieldDelimiter,
        @OutputCustomType.Parameter("nullMarker") String nullMarker,
        @OutputCustomType.Parameter("quote") String quote,
        @OutputCustomType.Parameter("skipLeadingRows") String skipLeadingRows) {
        this.allowJaggedRows = allowJaggedRows;
        this.allowQuotedNewlines = allowQuotedNewlines;
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.nullMarker = nullMarker;
        this.quote = quote;
        this.skipLeadingRows = skipLeadingRows;
    }

    /**
     * [Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
     * 
    */
    public Boolean getAllowJaggedRows() {
        return this.allowJaggedRows;
    }
    /**
     * [Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
     * 
    */
    public Boolean getAllowQuotedNewlines() {
        return this.allowQuotedNewlines;
    }
    /**
     * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
     * 
    */
    public String getEncoding() {
        return this.encoding;
    }
    /**
     * [Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
     * 
    */
    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }
    /**
     * [Optional] An custom string that will represent a NULL value in CSV import data.
     * 
    */
    public String getNullMarker() {
        return this.nullMarker;
    }
    /**
     * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
     * 
    */
    public String getQuote() {
        return this.quote;
    }
    /**
     * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped. When autodetect is on, the behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
    */
    public String getSkipLeadingRows() {
        return this.skipLeadingRows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsvOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowJaggedRows;
        private Boolean allowQuotedNewlines;
        private String encoding;
        private String fieldDelimiter;
        private String nullMarker;
        private String quote;
        private String skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(CsvOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.nullMarker = defaults.nullMarker;
    	      this.quote = defaults.quote;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder allowJaggedRows(Boolean allowJaggedRows) {
            this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows);
            return this;
        }

        public Builder allowQuotedNewlines(Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines);
            return this;
        }

        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
            return this;
        }

        public Builder nullMarker(String nullMarker) {
            this.nullMarker = Objects.requireNonNull(nullMarker);
            return this;
        }

        public Builder quote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }

        public Builder skipLeadingRows(String skipLeadingRows) {
            this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
            return this;
        }
        public CsvOptionsResponse build() {
            return new CsvOptionsResponse(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, nullMarker, quote, skipLeadingRows);
        }
    }
}
