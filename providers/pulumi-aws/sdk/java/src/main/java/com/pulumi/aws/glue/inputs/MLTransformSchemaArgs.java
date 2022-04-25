// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MLTransformSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final MLTransformSchemaArgs Empty = new MLTransformSchemaArgs();

    /**
     * The type of data in the column.
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    /**
     * @return The type of data in the column.
     * 
     */
    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private MLTransformSchemaArgs() {}

    private MLTransformSchemaArgs(MLTransformSchemaArgs $) {
        this.dataType = $.dataType;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MLTransformSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MLTransformSchemaArgs $;

        public Builder() {
            $ = new MLTransformSchemaArgs();
        }

        public Builder(MLTransformSchemaArgs defaults) {
            $ = new MLTransformSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataType The type of data in the column.
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType The type of data in the column.
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param name The name you assign to this ML Transform. It must be unique in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name you assign to this ML Transform. It must be unique in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public MLTransformSchemaArgs build() {
            return $;
        }
    }

}
