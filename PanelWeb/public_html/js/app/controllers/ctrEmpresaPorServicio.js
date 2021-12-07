PanelWeb.controller("ctrListarSolicitudesEmpresa", ['$scope', '$http', '$q', '$location', 'empresaService', 'listItemService', 'msgServices', 'uiGridValidateService', 'sessionService', 'servicioService', 'usuarioService', function ($scope, $http, $q, $location, empresaService, listItemService, msgServices, uiGridValidateService, sessionService, servicioService, usuarioService) {

        function verificarPermiso()
        {
            var arr = JSON.parse(sessionService.get('permisos'));
            if (arr != null)
            {
                var rest = false;
                for (var i = 0; i < arr.length; i++)
                {
                    if (arr[i].idPermiso == 32)
                        rest = true;
                }

                if (!rest)
                {
                    $location.path('inicio');
                }
            }
        }
        verificarPermiso();
        $scope.titulo = "Servicios Por Empresa";
        $scope.listarServicios = listarServicios;
        $scope.empresas = [];
        $scope.idSupervisor = -1;
        $scope.verServicio = verServicio;
        $scope.myData = [];
        init();

        function init()
        {
            $scope.idSupervisor = -1;
            empresaService.getEmpresas().then(function (data) {
                var emp = {idEmpresa: -1, nombre: '-------- Todos --------'};
                $scope.empresas.push(emp);
                for (var i = 0; i < data.length; i++)
                {
                    $scope.empresas.push(data[i]);
                }
                listarServicios();
            });
        }

        function listarServicios()
        {
            if ($scope.idEmpresa == null)
                $scope.idEmpresa = -1;
            servicioService.getSupervisorEmpresa($scope.idEmpresa).then(function (data) {
                $scope.myData = data;
            });

        }
        ;

        function verServicio(entity)
        {
            usuarioService.verificarPermiso(25).then(function (data) {
                if (data == true)
                {
                    sessionService.set("idServicio_verServicio", entity.idServicio);
                    $location.path("/verServicio");
                } else
                {
                    swal("No tiene permisos para ingresar a esta página");
                }
            });

        }
        //Configuración de la grilla
        $scope.gridOptions = {
            enableSorting: true,
            enableCellEditOnFocus: true,
            enablePinning: true,
            showGridFooter: true,
            enableFiltering: true,
            paginationPageSizes: [25, 50, 75],
            paginationPageSize: 10,
            data: 'myData',
            columnDefs: [
                {field: 'Ver Servicio', width: '13%', enableCellEdit: false, enableFiltering: false, cellTemplate: '<center><button class="btn btn-sm glyphicon glyphicon-eye-open btn-primary"  ng-click="grid.appScope.verServicio(row.entity)"></button></center>'},
                {field: 'idServicio', width: '20%', enableCellEdit: false, visible: true, displayName: 'Nro. Servicio'},
                {field: 'idEmpresa', width: '15%', enableCellEdit: false, displayName: 'Nro. Empresa'},
                {field: 'nombreEmpresa', width: '20%', enableCellEdit: false, displayName: 'Nombre empresa'},
                {field: 'descripcionEmpresa', width: '20%', enableCellEdit: false, displayName: 'Desc. Empresa'},
                {field: 'descripcionServicio', width: '30%', enableCellEdit: false},
                {field: 'estado', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nombre', width: '15%', enableCellEdit: false, displayName: 'Estado'},
                {field: 'idTipoServicio', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nombreTipoServicio', width: '25%', enableCellEdit: false, displayName: 'Tipo de Servicio'},
                {field: 'descripcionTipoServicio', width: '20%', enableCellEdit: false, visible: false},
                {field: 'idArea', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nombreArea', width: '20%', enableCellEdit: false, displayName: 'Area IDM'},
                {field: 'idBarrio', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nombreBarrio', width: '20%', enableCellEdit: false, visible: false},
                {field: 'idMunicipio', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nombreMunicipiom', width: '20%', enableCellEdit: false, visible: false},
                {field: 'idUbicacionServicio', width: '20%', enableCellEdit: false, visible: false},
                {field: 'calle', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nroPuerta', width: '20%', enableCellEdit: false, visible: false},
                {field: 'apto', width: '20%', enableCellEdit: false, visible: false},
                {field: 'entreCalles', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nroManzana', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nroSolar', width: '20%', enableCellEdit: false, visible: false},
                {field: 'nroPadron', width: '20%', enableCellEdit: false, visible: false},
                {field: 'latitud', width: '20%', enableCellEdit: false, visible: false},
                {field: 'longitud', width: '20%', enableCellEdit: false, visible: false},
                {field: 'fechaIngreso', width: '20%', enableCellEdit: false},
                {field: 'fechaCambioEstado', width: '25%', enableCellEdit: false, displayName: 'Última Modificación'},
                {field: 'qtSolicitantes', width: '30%', enableCellEdit: false, displayName: 'Cant. Solicitantes', visible: false},
                {field: 'DiasIngreso', width: '30%', enableCellEdit: false, displayName: 'Dias en estado Pendiente', visible: false}
            ],
            enableGridMenu: true,
            exporterCsvFilename: 'EmpresasPorServicio.csv',
            exporterPdfDefaultStyle: {fontSize: 9},
            exporterPdfTableStyle: {margin: [30, 30, 30, 30]},
            exporterPdfTableHeaderStyle: {fontSize: 10, bold: true, italics: true, color: 'red'},
            exporterPdfHeader: {text: "My Header", style: 'headerStyle'},
            exporterPdfFooter: function (currentPage, pageCount) {
                return {text: currentPage.toString() + ' of ' + pageCount.toString(), style: 'footerStyle'};
            },
            exporterPdfCustomFormatter: function (docDefinition) {
                docDefinition.styles.headerStyle = {fontSize: 22, bold: true};
                docDefinition.styles.footerStyle = {fontSize: 10, bold: true};
                return docDefinition;
            },
            exporterPdfOrientation: 'portrait',
            exporterPdfPageSize: 'LETTER',
            exporterPdfMaxGridWidth: 500,
            exporterCsvLinkElement: angular.element(document.querySelectorAll(".custom-csv-link-location"))
        };

    }]);
