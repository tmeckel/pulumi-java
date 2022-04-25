// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartitionStorageDescriptorSerDeInfoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PartitionStorageDescriptorSerDeInfoGetArgs Empty = new PartitionStorageDescriptorSerDeInfoGetArgs();

    /**
     * Name of the SerDe.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the SerDe.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
     * 
     */
    @Import(name="serializationLibrary")
    private @Nullable Output<String> serializationLibrary;

    /**
     * @return Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
     * 
     */
    public Optional<Output<String>> serializationLibrary() {
        return Optional.ofNullable(this.serializationLibrary);
    }

    private PartitionStorageDescriptorSerDeInfoGetArgs() {}

    private PartitionStorageDescriptorSerDeInfoGetArgs(PartitionStorageDescriptorSerDeInfoGetArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
        this.serializationLibrary = $.serializationLibrary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartitionStorageDescriptorSerDeInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartitionStorageDescriptorSerDeInfoGetArgs $;

        public Builder() {
            $ = new PartitionStorageDescriptorSerDeInfoGetArgs();
        }

        public Builder(PartitionStorageDescriptorSerDeInfoGetArgs defaults) {
            $ = new PartitionStorageDescriptorSerDeInfoGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the SerDe.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SerDe.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of initialization parameters for the SerDe, in key-value form.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of initialization parameters for the SerDe, in key-value form.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param serializationLibrary Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
         * 
         * @return builder
         * 
         */
        public Builder serializationLibrary(@Nullable Output<String> serializationLibrary) {
            $.serializationLibrary = serializationLibrary;
            return this;
        }

        /**
         * @param serializationLibrary Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
         * 
         * @return builder
         * 
         */
        public Builder serializationLibrary(String serializationLibrary) {
            return serializationLibrary(Output.of(serializationLibrary));
        }

        public PartitionStorageDescriptorSerDeInfoGetArgs build() {
            return $;
        }
    }

}
