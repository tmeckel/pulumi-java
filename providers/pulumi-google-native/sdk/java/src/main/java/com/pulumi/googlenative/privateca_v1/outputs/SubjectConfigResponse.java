// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca_v1.outputs.SubjectAltNamesResponse;
import com.pulumi.googlenative.privateca_v1.outputs.SubjectResponse;
import java.util.Objects;

@CustomType
public final class SubjectConfigResponse {
    /**
     * @return Contains distinguished name fields such as the common name, location and organization.
     * 
     */
    private final SubjectResponse subject;
    /**
     * @return Optional. The subject alternative name fields.
     * 
     */
    private final SubjectAltNamesResponse subjectAltName;

    @CustomType.Constructor
    private SubjectConfigResponse(
        @CustomType.Parameter("subject") SubjectResponse subject,
        @CustomType.Parameter("subjectAltName") SubjectAltNamesResponse subjectAltName) {
        this.subject = subject;
        this.subjectAltName = subjectAltName;
    }

    /**
     * @return Contains distinguished name fields such as the common name, location and organization.
     * 
     */
    public SubjectResponse subject() {
        return this.subject;
    }
    /**
     * @return Optional. The subject alternative name fields.
     * 
     */
    public SubjectAltNamesResponse subjectAltName() {
        return this.subjectAltName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectResponse subject;
        private SubjectAltNamesResponse subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder subject(SubjectResponse subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subjectAltName(SubjectAltNamesResponse subjectAltName) {
            this.subjectAltName = Objects.requireNonNull(subjectAltName);
            return this;
        }        public SubjectConfigResponse build() {
            return new SubjectConfigResponse(subject, subjectAltName);
        }
    }
}
