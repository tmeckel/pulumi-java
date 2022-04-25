// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe {
    /**
     * @return When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
     * 
     */
    private final @Nullable Boolean caseInsensitive;
    /**
     * @return A map of column names to JSON keys that aren&#39;t identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = &#34;timestamp&#34; }` to map this key to a column named ts.
     * 
     */
    private final @Nullable Map<String,String> columnToJsonKeyMappings;
    /**
     * @return When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is &#34;a.b&#34;, you can define the column name to be &#34;a_b&#34; when using this option. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean convertDotsInJsonKeysToUnderscores;

    @CustomType.Constructor
    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe(
        @CustomType.Parameter("caseInsensitive") @Nullable Boolean caseInsensitive,
        @CustomType.Parameter("columnToJsonKeyMappings") @Nullable Map<String,String> columnToJsonKeyMappings,
        @CustomType.Parameter("convertDotsInJsonKeysToUnderscores") @Nullable Boolean convertDotsInJsonKeysToUnderscores) {
        this.caseInsensitive = caseInsensitive;
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
    }

    /**
     * @return When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
     * 
     */
    public Optional<Boolean> caseInsensitive() {
        return Optional.ofNullable(this.caseInsensitive);
    }
    /**
     * @return A map of column names to JSON keys that aren&#39;t identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = &#34;timestamp&#34; }` to map this key to a column named ts.
     * 
     */
    public Map<String,String> columnToJsonKeyMappings() {
        return this.columnToJsonKeyMappings == null ? Map.of() : this.columnToJsonKeyMappings;
    }
    /**
     * @return When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is &#34;a.b&#34;, you can define the column name to be &#34;a_b&#34; when using this option. Defaults to `false`.
     * 
     */
    public Optional<Boolean> convertDotsInJsonKeysToUnderscores() {
        return Optional.ofNullable(this.convertDotsInJsonKeysToUnderscores);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean caseInsensitive;
        private @Nullable Map<String,String> columnToJsonKeyMappings;
        private @Nullable Boolean convertDotsInJsonKeysToUnderscores;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseInsensitive = defaults.caseInsensitive;
    	      this.columnToJsonKeyMappings = defaults.columnToJsonKeyMappings;
    	      this.convertDotsInJsonKeysToUnderscores = defaults.convertDotsInJsonKeysToUnderscores;
        }

        public Builder caseInsensitive(@Nullable Boolean caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public Builder columnToJsonKeyMappings(@Nullable Map<String,String> columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = columnToJsonKeyMappings;
            return this;
        }
        public Builder convertDotsInJsonKeysToUnderscores(@Nullable Boolean convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe(caseInsensitive, columnToJsonKeyMappings, convertDotsInJsonKeysToUnderscores);
        }
    }
}
