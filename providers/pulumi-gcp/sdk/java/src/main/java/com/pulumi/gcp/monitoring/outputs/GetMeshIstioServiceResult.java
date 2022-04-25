// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceTelemetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMeshIstioServiceResult {
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String meshUid;
    private final String name;
    private final @Nullable String project;
    private final String serviceId;
    private final String serviceName;
    private final String serviceNamespace;
    private final List<GetMeshIstioServiceTelemetry> telemetries;

    @CustomType.Constructor
    private GetMeshIstioServiceResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("meshUid") String meshUid,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("serviceId") String serviceId,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("serviceNamespace") String serviceNamespace,
        @CustomType.Parameter("telemetries") List<GetMeshIstioServiceTelemetry> telemetries) {
        this.displayName = displayName;
        this.id = id;
        this.meshUid = meshUid;
        this.name = name;
        this.project = project;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceNamespace = serviceNamespace;
        this.telemetries = telemetries;
    }

    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String meshUid() {
        return this.meshUid;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String serviceId() {
        return this.serviceId;
    }
    public String serviceName() {
        return this.serviceName;
    }
    public String serviceNamespace() {
        return this.serviceNamespace;
    }
    public List<GetMeshIstioServiceTelemetry> telemetries() {
        return this.telemetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshIstioServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private String meshUid;
        private String name;
        private @Nullable String project;
        private String serviceId;
        private String serviceName;
        private String serviceNamespace;
        private List<GetMeshIstioServiceTelemetry> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshIstioServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.meshUid = defaults.meshUid;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.telemetries = defaults.telemetries;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder meshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }
        public Builder telemetries(List<GetMeshIstioServiceTelemetry> telemetries) {
            this.telemetries = Objects.requireNonNull(telemetries);
            return this;
        }
        public Builder telemetries(GetMeshIstioServiceTelemetry... telemetries) {
            return telemetries(List.of(telemetries));
        }        public GetMeshIstioServiceResult build() {
            return new GetMeshIstioServiceResult(displayName, id, meshUid, name, project, serviceId, serviceName, serviceNamespace, telemetries);
        }
    }
}
