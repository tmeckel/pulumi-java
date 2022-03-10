// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorCsvFormatDescriptorFileCompression;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnomalyDetectorCsvFormatDescriptor {
    private final @Nullable String charset;
    private final @Nullable Boolean containsHeader;
    private final @Nullable String delimiter;
    private final @Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression;
    private final @Nullable List<String> headerList;
    private final @Nullable String quoteSymbol;

    @OutputCustomType.Constructor
    private AnomalyDetectorCsvFormatDescriptor(
        @OutputCustomType.Parameter("charset") @Nullable String charset,
        @OutputCustomType.Parameter("containsHeader") @Nullable Boolean containsHeader,
        @OutputCustomType.Parameter("delimiter") @Nullable String delimiter,
        @OutputCustomType.Parameter("fileCompression") @Nullable AnomalyDetectorCsvFormatDescriptorFileCompression fileCompression,
        @OutputCustomType.Parameter("headerList") @Nullable List<String> headerList,
        @OutputCustomType.Parameter("quoteSymbol") @Nullable String quoteSymbol) {
        this.charset = charset;
        this.containsHeader = containsHeader;
        this.delimiter = delimiter;
        this.fileCompression = fileCompression;
        this.headerList = headerList;
        this.quoteSymbol = quoteSymbol;
    }

    public Optional<String> getCharset() {
        return Optional.ofNullable(this.charset);
    }
    public Optional<Boolean> getContainsHeader() {
        return Optional.ofNullable(this.containsHeader);
    }
    public Optional<String> getDelimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    public Optional<AnomalyDetectorCsvFormatDescriptorFileCompression> getFileCompression() {
        return Optional.ofNullable(this.fileCompression);
    }
    public List<String> getHeaderList() {
        return this.headerList == null ? List.of() : this.headerList;
    }
    public Optional<String> getQuoteSymbol() {
        return Optional.ofNullable(this.quoteSymbol);
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
