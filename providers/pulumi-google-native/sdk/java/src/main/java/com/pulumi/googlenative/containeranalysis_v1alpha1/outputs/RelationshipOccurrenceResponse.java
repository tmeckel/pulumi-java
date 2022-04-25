// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RelationshipOccurrenceResponse {
    /**
     * @return A place for the SPDX file creator to record any general comments about the relationship
     * 
     */
    private final String comment;
    /**
     * @return Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
     * 
     */
    private final String source;
    /**
     * @return Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there are &#34;known unknowns&#34;, the use of the keyword NOASSERTION can be used The keywords NONE can be used to indicate that an SPDX element (package/file/snippet) has no other elements connected by some relationship to it
     * 
     */
    private final String target;
    /**
     * @return The type of relationship between the source and target SPDX elements
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RelationshipOccurrenceResponse(
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("type") String type) {
        this.comment = comment;
        this.source = source;
        this.target = target;
        this.type = type;
    }

    /**
     * @return A place for the SPDX file creator to record any general comments about the relationship
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there are &#34;known unknowns&#34;, the use of the keyword NOASSERTION can be used The keywords NONE can be used to indicate that an SPDX element (package/file/snippet) has no other elements connected by some relationship to it
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The type of relationship between the source and target SPDX elements
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private String source;
        private String target;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RelationshipOccurrenceResponse build() {
            return new RelationshipOccurrenceResponse(comment, source, target, type);
        }
    }
}
