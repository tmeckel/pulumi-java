// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IncidentInfoResponse {
    /**
     * @return Incident Id
     * 
     */
    private final @Nullable String incidentId;
    /**
     * @return Relation Name
     * 
     */
    private final @Nullable String relationName;
    /**
     * @return The severity of the incident
     * 
     */
    private final @Nullable String severity;
    /**
     * @return The title of the incident
     * 
     */
    private final @Nullable String title;

    @CustomType.Constructor
    private IncidentInfoResponse(
        @CustomType.Parameter("incidentId") @Nullable String incidentId,
        @CustomType.Parameter("relationName") @Nullable String relationName,
        @CustomType.Parameter("severity") @Nullable String severity,
        @CustomType.Parameter("title") @Nullable String title) {
        this.incidentId = incidentId;
        this.relationName = relationName;
        this.severity = severity;
        this.title = title;
    }

    /**
     * @return Incident Id
     * 
     */
    public Optional<String> incidentId() {
        return Optional.ofNullable(this.incidentId);
    }
    /**
     * @return Relation Name
     * 
     */
    public Optional<String> relationName() {
        return Optional.ofNullable(this.relationName);
    }
    /**
     * @return The severity of the incident
     * 
     */
    public Optional<String> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return The title of the incident
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String incidentId;
        private @Nullable String relationName;
        private @Nullable String severity;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentId = defaults.incidentId;
    	      this.relationName = defaults.relationName;
    	      this.severity = defaults.severity;
    	      this.title = defaults.title;
        }

        public Builder incidentId(@Nullable String incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Builder relationName(@Nullable String relationName) {
            this.relationName = relationName;
            return this;
        }
        public Builder severity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }        public IncidentInfoResponse build() {
            return new IncidentInfoResponse(incidentId, relationName, severity, title);
        }
    }
}
