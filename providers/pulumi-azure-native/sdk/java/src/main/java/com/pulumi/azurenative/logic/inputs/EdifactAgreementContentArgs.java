// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.EdifactOneWayAgreementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The Edifact agreement content.
 * 
 */
public final class EdifactAgreementContentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactAgreementContentArgs Empty = new EdifactAgreementContentArgs();

    /**
     * The EDIFACT one-way receive agreement.
     * 
     */
    @Import(name="receiveAgreement", required=true)
    private Output<EdifactOneWayAgreementArgs> receiveAgreement;

    /**
     * @return The EDIFACT one-way receive agreement.
     * 
     */
    public Output<EdifactOneWayAgreementArgs> receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The EDIFACT one-way send agreement.
     * 
     */
    @Import(name="sendAgreement", required=true)
    private Output<EdifactOneWayAgreementArgs> sendAgreement;

    /**
     * @return The EDIFACT one-way send agreement.
     * 
     */
    public Output<EdifactOneWayAgreementArgs> sendAgreement() {
        return this.sendAgreement;
    }

    private EdifactAgreementContentArgs() {}

    private EdifactAgreementContentArgs(EdifactAgreementContentArgs $) {
        this.receiveAgreement = $.receiveAgreement;
        this.sendAgreement = $.sendAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactAgreementContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactAgreementContentArgs $;

        public Builder() {
            $ = new EdifactAgreementContentArgs();
        }

        public Builder(EdifactAgreementContentArgs defaults) {
            $ = new EdifactAgreementContentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param receiveAgreement The EDIFACT one-way receive agreement.
         * 
         * @return builder
         * 
         */
        public Builder receiveAgreement(Output<EdifactOneWayAgreementArgs> receiveAgreement) {
            $.receiveAgreement = receiveAgreement;
            return this;
        }

        /**
         * @param receiveAgreement The EDIFACT one-way receive agreement.
         * 
         * @return builder
         * 
         */
        public Builder receiveAgreement(EdifactOneWayAgreementArgs receiveAgreement) {
            return receiveAgreement(Output.of(receiveAgreement));
        }

        /**
         * @param sendAgreement The EDIFACT one-way send agreement.
         * 
         * @return builder
         * 
         */
        public Builder sendAgreement(Output<EdifactOneWayAgreementArgs> sendAgreement) {
            $.sendAgreement = sendAgreement;
            return this;
        }

        /**
         * @param sendAgreement The EDIFACT one-way send agreement.
         * 
         * @return builder
         * 
         */
        public Builder sendAgreement(EdifactOneWayAgreementArgs sendAgreement) {
            return sendAgreement(Output.of(sendAgreement));
        }

        public EdifactAgreementContentArgs build() {
            $.receiveAgreement = Objects.requireNonNull($.receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
            $.sendAgreement = Objects.requireNonNull($.sendAgreement, "expected parameter 'sendAgreement' to be non-null");
            return $;
        }
    }

}
