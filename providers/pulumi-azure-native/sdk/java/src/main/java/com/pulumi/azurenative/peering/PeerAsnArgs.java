// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.azurenative.peering.enums.ValidationState;
import com.pulumi.azurenative.peering.inputs.ContactDetailArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeerAsnArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeerAsnArgs Empty = new PeerAsnArgs();

    /**
     * The Autonomous System Number (ASN) of the peer.
     * 
     */
    @Import(name="peerAsn")
    private @Nullable Output<Integer> peerAsn;

    /**
     * @return The Autonomous System Number (ASN) of the peer.
     * 
     */
    public Optional<Output<Integer>> peerAsn() {
        return Optional.ofNullable(this.peerAsn);
    }

    /**
     * The peer ASN name.
     * 
     */
    @Import(name="peerAsnName")
    private @Nullable Output<String> peerAsnName;

    /**
     * @return The peer ASN name.
     * 
     */
    public Optional<Output<String>> peerAsnName() {
        return Optional.ofNullable(this.peerAsnName);
    }

    /**
     * The contact details of the peer.
     * 
     */
    @Import(name="peerContactDetail")
    private @Nullable Output<List<ContactDetailArgs>> peerContactDetail;

    /**
     * @return The contact details of the peer.
     * 
     */
    public Optional<Output<List<ContactDetailArgs>>> peerContactDetail() {
        return Optional.ofNullable(this.peerContactDetail);
    }

    /**
     * The name of the peer.
     * 
     */
    @Import(name="peerName")
    private @Nullable Output<String> peerName;

    /**
     * @return The name of the peer.
     * 
     */
    public Optional<Output<String>> peerName() {
        return Optional.ofNullable(this.peerName);
    }

    /**
     * The validation state of the ASN associated with the peer.
     * 
     */
    @Import(name="validationState")
    private @Nullable Output<Either<String,ValidationState>> validationState;

    /**
     * @return The validation state of the ASN associated with the peer.
     * 
     */
    public Optional<Output<Either<String,ValidationState>>> validationState() {
        return Optional.ofNullable(this.validationState);
    }

    private PeerAsnArgs() {}

    private PeerAsnArgs(PeerAsnArgs $) {
        this.peerAsn = $.peerAsn;
        this.peerAsnName = $.peerAsnName;
        this.peerContactDetail = $.peerContactDetail;
        this.peerName = $.peerName;
        this.validationState = $.validationState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeerAsnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeerAsnArgs $;

        public Builder() {
            $ = new PeerAsnArgs();
        }

        public Builder(PeerAsnArgs defaults) {
            $ = new PeerAsnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peerAsn The Autonomous System Number (ASN) of the peer.
         * 
         * @return builder
         * 
         */
        public Builder peerAsn(@Nullable Output<Integer> peerAsn) {
            $.peerAsn = peerAsn;
            return this;
        }

        /**
         * @param peerAsn The Autonomous System Number (ASN) of the peer.
         * 
         * @return builder
         * 
         */
        public Builder peerAsn(Integer peerAsn) {
            return peerAsn(Output.of(peerAsn));
        }

        /**
         * @param peerAsnName The peer ASN name.
         * 
         * @return builder
         * 
         */
        public Builder peerAsnName(@Nullable Output<String> peerAsnName) {
            $.peerAsnName = peerAsnName;
            return this;
        }

        /**
         * @param peerAsnName The peer ASN name.
         * 
         * @return builder
         * 
         */
        public Builder peerAsnName(String peerAsnName) {
            return peerAsnName(Output.of(peerAsnName));
        }

        /**
         * @param peerContactDetail The contact details of the peer.
         * 
         * @return builder
         * 
         */
        public Builder peerContactDetail(@Nullable Output<List<ContactDetailArgs>> peerContactDetail) {
            $.peerContactDetail = peerContactDetail;
            return this;
        }

        /**
         * @param peerContactDetail The contact details of the peer.
         * 
         * @return builder
         * 
         */
        public Builder peerContactDetail(List<ContactDetailArgs> peerContactDetail) {
            return peerContactDetail(Output.of(peerContactDetail));
        }

        /**
         * @param peerContactDetail The contact details of the peer.
         * 
         * @return builder
         * 
         */
        public Builder peerContactDetail(ContactDetailArgs... peerContactDetail) {
            return peerContactDetail(List.of(peerContactDetail));
        }

        /**
         * @param peerName The name of the peer.
         * 
         * @return builder
         * 
         */
        public Builder peerName(@Nullable Output<String> peerName) {
            $.peerName = peerName;
            return this;
        }

        /**
         * @param peerName The name of the peer.
         * 
         * @return builder
         * 
         */
        public Builder peerName(String peerName) {
            return peerName(Output.of(peerName));
        }

        /**
         * @param validationState The validation state of the ASN associated with the peer.
         * 
         * @return builder
         * 
         */
        public Builder validationState(@Nullable Output<Either<String,ValidationState>> validationState) {
            $.validationState = validationState;
            return this;
        }

        /**
         * @param validationState The validation state of the ASN associated with the peer.
         * 
         * @return builder
         * 
         */
        public Builder validationState(Either<String,ValidationState> validationState) {
            return validationState(Output.of(validationState));
        }

        /**
         * @param validationState The validation state of the ASN associated with the peer.
         * 
         * @return builder
         * 
         */
        public Builder validationState(String validationState) {
            return validationState(Either.ofLeft(validationState));
        }

        /**
         * @param validationState The validation state of the ASN associated with the peer.
         * 
         * @return builder
         * 
         */
        public Builder validationState(ValidationState validationState) {
            return validationState(Either.ofRight(validationState));
        }

        public PeerAsnArgs build() {
            return $;
        }
    }

}
