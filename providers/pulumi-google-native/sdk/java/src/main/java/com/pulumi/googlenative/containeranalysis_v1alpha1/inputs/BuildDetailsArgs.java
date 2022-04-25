// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuildProvenanceArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InTotoStatementArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message encapsulating build provenance details.
 * 
 */
public final class BuildDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildDetailsArgs Empty = new BuildDetailsArgs();

    /**
     * In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
     * 
     */
    @Import(name="intotoStatement")
    private @Nullable Output<InTotoStatementArgs> intotoStatement;

    /**
     * @return In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
     * 
     */
    public Optional<Output<InTotoStatementArgs>> intotoStatement() {
        return Optional.ofNullable(this.intotoStatement);
    }

    /**
     * The actual provenance
     * 
     */
    @Import(name="provenance")
    private @Nullable Output<BuildProvenanceArgs> provenance;

    /**
     * @return The actual provenance
     * 
     */
    public Optional<Output<BuildProvenanceArgs>> provenance() {
        return Optional.ofNullable(this.provenance);
    }

    /**
     * Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    @Import(name="provenanceBytes")
    private @Nullable Output<String> provenanceBytes;

    /**
     * @return Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    public Optional<Output<String>> provenanceBytes() {
        return Optional.ofNullable(this.provenanceBytes);
    }

    private BuildDetailsArgs() {}

    private BuildDetailsArgs(BuildDetailsArgs $) {
        this.intotoStatement = $.intotoStatement;
        this.provenance = $.provenance;
        this.provenanceBytes = $.provenanceBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildDetailsArgs $;

        public Builder() {
            $ = new BuildDetailsArgs();
        }

        public Builder(BuildDetailsArgs defaults) {
            $ = new BuildDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param intotoStatement In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
         * 
         * @return builder
         * 
         */
        public Builder intotoStatement(@Nullable Output<InTotoStatementArgs> intotoStatement) {
            $.intotoStatement = intotoStatement;
            return this;
        }

        /**
         * @param intotoStatement In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
         * 
         * @return builder
         * 
         */
        public Builder intotoStatement(InTotoStatementArgs intotoStatement) {
            return intotoStatement(Output.of(intotoStatement));
        }

        /**
         * @param provenance The actual provenance
         * 
         * @return builder
         * 
         */
        public Builder provenance(@Nullable Output<BuildProvenanceArgs> provenance) {
            $.provenance = provenance;
            return this;
        }

        /**
         * @param provenance The actual provenance
         * 
         * @return builder
         * 
         */
        public Builder provenance(BuildProvenanceArgs provenance) {
            return provenance(Output.of(provenance));
        }

        /**
         * @param provenanceBytes Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
         * 
         * @return builder
         * 
         */
        public Builder provenanceBytes(@Nullable Output<String> provenanceBytes) {
            $.provenanceBytes = provenanceBytes;
            return this;
        }

        /**
         * @param provenanceBytes Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
         * 
         * @return builder
         * 
         */
        public Builder provenanceBytes(String provenanceBytes) {
            return provenanceBytes(Output.of(provenanceBytes));
        }

        public BuildDetailsArgs build() {
            return $;
        }
    }

}
