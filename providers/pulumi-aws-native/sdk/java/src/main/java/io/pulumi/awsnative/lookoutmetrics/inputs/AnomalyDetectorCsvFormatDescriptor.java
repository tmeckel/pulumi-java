// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorCsvFormatDescriptorFileCompression;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorCsvFormatDescriptor extends io.pulumi.resources.InvokeArgs {

    public static final AnomalyDetectorCsvFormatDescriptor Empty = new AnomalyDetectorCsvFormatDescriptor();

    @InputImport(name="charset")
      private final @Nullable String charset;

    public Optional<String> getCharset() {
        return this.charset == null ? Optional.empty() : Optional.ofNullable(this.charset);
    }

    @InputImport(name="containsHeader")
      private final @Nullable Boolean containsHeader;

    public Optional<Boolean> getContainsHeader() {
        return this.containsHeader == null ? Optional.empty() : Optional.ofNullable(this.containsHeader);
    }

    @InputImport(name="delimiter")
      private final @Nullable String delimiter;

    public Optional<String> getDelimiter() {
        return this.delimiter == null ? Optional.empty() : Optional.ofNullable(this.delimiter);
    }

    @InputImport(name="fileCompression")
      private final @Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression;

    public Optional<AnomalyDetectorCsvFormatDescriptorFileCompression> getFileCompression() {
        return this.fileCompression == null ? Optional.empty() : Optional.ofNullable(this.fileCompression);
    }

    @InputImport(name="headerList")
      private final @Nullable List<String> headerList;

    public List<String> getHeaderList() {
        return this.headerList == null ? List.of() : this.headerList;
    }

    @InputImport(name="quoteSymbol")
      private final @Nullable String quoteSymbol;

    public Optional<String> getQuoteSymbol() {
        return this.quoteSymbol == null ? Optional.empty() : Optional.ofNullable(this.quoteSymbol);
    }

    public AnomalyDetectorCsvFormatDescriptor(
        @Nullable String charset,
        @Nullable Boolean containsHeader,
        @Nullable String delimiter,
        @Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression,
        @Nullable List<String> headerList,
        @Nullable String quoteSymbol) {
        this.charset = charset;
        this.containsHeader = containsHeader;
        this.delimiter = delimiter;
        this.fileCompression = fileCompression;
        this.headerList = headerList;
        this.quoteSymbol = quoteSymbol;
    }

    private AnomalyDetectorCsvFormatDescriptor() {
        this.charset = null;
        this.containsHeader = null;
        this.delimiter = null;
        this.fileCompression = null;
        this.headerList = List.of();
        this.quoteSymbol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorCsvFormatDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String charset;
        private @Nullable Boolean containsHeader;
        private @Nullable String delimiter;
        private @Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression;
        private @Nullable List<String> headerList;
        private @Nullable String quoteSymbol;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorCsvFormatDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charset = defaults.charset;
    	      this.containsHeader = defaults.containsHeader;
    	      this.delimiter = defaults.delimiter;
    	      this.fileCompression = defaults.fileCompression;
    	      this.headerList = defaults.headerList;
    	      this.quoteSymbol = defaults.quoteSymbol;
        }

        public Builder charset(@Nullable String charset) {
            this.charset = charset;
            return this;
        }

        public Builder containsHeader(@Nullable Boolean containsHeader) {
            this.containsHeader = containsHeader;
            return this;
        }

        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public Builder fileCompression(@Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression) {
            this.fileCompression = fileCompression;
            return this;
        }

        public Builder headerList(@Nullable List<String> headerList) {
            this.headerList = headerList;
            return this;
        }

        public Builder quoteSymbol(@Nullable String quoteSymbol) {
            this.quoteSymbol = quoteSymbol;
            return this;
        }
        public AnomalyDetectorCsvFormatDescriptor build() {
            return new AnomalyDetectorCsvFormatDescriptor(charset, containsHeader, delimiter, fileCompression, headerList, quoteSymbol);
        }
    }
}
