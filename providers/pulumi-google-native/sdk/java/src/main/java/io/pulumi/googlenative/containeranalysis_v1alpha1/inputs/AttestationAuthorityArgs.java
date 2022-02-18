// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.AttestationAuthorityHintArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Note kind that represents a logical attestation "role" or "authority". For example, an organization might have one `AttestationAuthority` for "QA" and one for "build". This Note is intended to act strictly as a grouping mechanism for the attached Occurrences (Attestations). This grouping mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to attach an Occurrence to a given Note. It also provides a single point of lookup to find all attached Attestation Occurrences, even if they don't all live in the same project.
 * 
 */
public final class AttestationAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestationAuthorityArgs Empty = new AttestationAuthorityArgs();

    @InputImport(name="hint")
    private final @Nullable Input<AttestationAuthorityHintArgs> hint;

    public Input<AttestationAuthorityHintArgs> getHint() {
        return this.hint == null ? Input.empty() : this.hint;
    }

    public AttestationAuthorityArgs(@Nullable Input<AttestationAuthorityHintArgs> hint) {
        this.hint = hint;
    }

    private AttestationAuthorityArgs() {
        this.hint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AttestationAuthorityHintArgs> hint;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder setHint(@Nullable Input<AttestationAuthorityHintArgs> hint) {
            this.hint = hint;
            return this;
        }

        public Builder setHint(@Nullable AttestationAuthorityHintArgs hint) {
            this.hint = Input.ofNullable(hint);
            return this;
        }

        public AttestationAuthorityArgs build() {
            return new AttestationAuthorityArgs(hint);
        }
    }
}
