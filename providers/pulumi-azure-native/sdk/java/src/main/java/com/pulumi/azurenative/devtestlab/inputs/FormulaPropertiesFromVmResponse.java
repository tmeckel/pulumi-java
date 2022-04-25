// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a VM from which a formula is to be created.
 * 
 */
public final class FormulaPropertiesFromVmResponse extends com.pulumi.resources.InvokeArgs {

    public static final FormulaPropertiesFromVmResponse Empty = new FormulaPropertiesFromVmResponse();

    /**
     * The identifier of the VM from which a formula is to be created.
     * 
     */
    @Import(name="labVmId")
    private @Nullable String labVmId;

    /**
     * @return The identifier of the VM from which a formula is to be created.
     * 
     */
    public Optional<String> labVmId() {
        return Optional.ofNullable(this.labVmId);
    }

    private FormulaPropertiesFromVmResponse() {}

    private FormulaPropertiesFromVmResponse(FormulaPropertiesFromVmResponse $) {
        this.labVmId = $.labVmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FormulaPropertiesFromVmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FormulaPropertiesFromVmResponse $;

        public Builder() {
            $ = new FormulaPropertiesFromVmResponse();
        }

        public Builder(FormulaPropertiesFromVmResponse defaults) {
            $ = new FormulaPropertiesFromVmResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param labVmId The identifier of the VM from which a formula is to be created.
         * 
         * @return builder
         * 
         */
        public Builder labVmId(@Nullable String labVmId) {
            $.labVmId = labVmId;
            return this;
        }

        public FormulaPropertiesFromVmResponse build() {
            return $;
        }
    }

}
