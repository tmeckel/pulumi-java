// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
 * 
 */
public final class DatasetResponseFolder extends com.pulumi.resources.InvokeArgs {

    public static final DatasetResponseFolder Empty = new DatasetResponseFolder();

    /**
     * The name of the folder that this Dataset is in.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the folder that this Dataset is in.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private DatasetResponseFolder() {}

    private DatasetResponseFolder(DatasetResponseFolder $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetResponseFolder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetResponseFolder $;

        public Builder() {
            $ = new DatasetResponseFolder();
        }

        public Builder(DatasetResponseFolder defaults) {
            $ = new DatasetResponseFolder(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the folder that this Dataset is in.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public DatasetResponseFolder build() {
            return $;
        }
    }

}
