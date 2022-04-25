// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Dsc configuration property associated with the entity.
 * 
 */
public final class DscConfigurationAssociationPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DscConfigurationAssociationPropertyArgs Empty = new DscConfigurationAssociationPropertyArgs();

    /**
     * Gets or sets the name of the Dsc configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Gets or sets the name of the Dsc configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DscConfigurationAssociationPropertyArgs() {}

    private DscConfigurationAssociationPropertyArgs(DscConfigurationAssociationPropertyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DscConfigurationAssociationPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DscConfigurationAssociationPropertyArgs $;

        public Builder() {
            $ = new DscConfigurationAssociationPropertyArgs();
        }

        public Builder(DscConfigurationAssociationPropertyArgs defaults) {
            $ = new DscConfigurationAssociationPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Gets or sets the name of the Dsc configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Gets or sets the name of the Dsc configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DscConfigurationAssociationPropertyArgs build() {
            return $;
        }
    }

}
