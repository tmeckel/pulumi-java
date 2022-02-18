// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsupport_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCaseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCaseArgs Empty = new GetCaseArgs();

    @InputImport(name="caseId", required=true)
    private final String caseId;

    public String getCaseId() {
        return this.caseId;
    }

    @InputImport(name="v2betaId1", required=true)
    private final String v2betaId1;

    public String getV2betaId1() {
        return this.v2betaId1;
    }

    @InputImport(name="v2betumId", required=true)
    private final String v2betumId;

    public String getV2betumId() {
        return this.v2betumId;
    }

    public GetCaseArgs(
        String caseId,
        String v2betaId1,
        String v2betumId) {
        this.caseId = Objects.requireNonNull(caseId, "expected parameter 'caseId' to be non-null");
        this.v2betaId1 = Objects.requireNonNull(v2betaId1, "expected parameter 'v2betaId1' to be non-null");
        this.v2betumId = Objects.requireNonNull(v2betumId, "expected parameter 'v2betumId' to be non-null");
    }

    private GetCaseArgs() {
        this.caseId = null;
        this.v2betaId1 = null;
        this.v2betumId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caseId;
        private String v2betaId1;
        private String v2betumId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseId = defaults.caseId;
    	      this.v2betaId1 = defaults.v2betaId1;
    	      this.v2betumId = defaults.v2betumId;
        }

        public Builder setCaseId(String caseId) {
            this.caseId = Objects.requireNonNull(caseId);
            return this;
        }

        public Builder setV2betaId1(String v2betaId1) {
            this.v2betaId1 = Objects.requireNonNull(v2betaId1);
            return this;
        }

        public Builder setV2betumId(String v2betumId) {
            this.v2betumId = Objects.requireNonNull(v2betumId);
            return this;
        }

        public GetCaseArgs build() {
            return new GetCaseArgs(caseId, v2betaId1, v2betumId);
        }
    }
}
