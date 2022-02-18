// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.storage_v1.outputs.ObjectIamPolicyBindingsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetObjectIamPolicyResult {
    /**
     * An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    private final List<ObjectIamPolicyBindingsItemResponse> bindings;
    /**
     * HTTP 1.1  Entity tag for the policy.
     * 
     */
    private final String etag;
    /**
     * The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
     */
    private final String kind;
    /**
     * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
     */
    private final String resourceId;
    /**
     * The IAM policy format version.
     * 
     */
    private final Integer version;

    @OutputCustomType.Constructor({"bindings","etag","kind","resourceId","version"})
    private GetObjectIamPolicyResult(
        List<ObjectIamPolicyBindingsItemResponse> bindings,
        String etag,
        String kind,
        String resourceId,
        Integer version) {
        this.bindings = Objects.requireNonNull(bindings);
        this.etag = Objects.requireNonNull(etag);
        this.kind = Objects.requireNonNull(kind);
        this.resourceId = Objects.requireNonNull(resourceId);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    public List<ObjectIamPolicyBindingsItemResponse> getBindings() {
        return this.bindings;
    }
    /**
     * HTTP 1.1  Entity tag for the policy.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
     */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * The IAM policy format version.
     * 
     */
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectIamPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ObjectIamPolicyBindingsItemResponse> bindings;
        private String etag;
        private String kind;
        private String resourceId;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.kind = defaults.kind;
    	      this.resourceId = defaults.resourceId;
    	      this.version = defaults.version;
        }

        public Builder setBindings(List<ObjectIamPolicyBindingsItemResponse> bindings) {
            this.bindings = Objects.requireNonNull(bindings);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetObjectIamPolicyResult build() {
            return new GetObjectIamPolicyResult(bindings, etag, kind, resourceId, version);
        }
    }
}
